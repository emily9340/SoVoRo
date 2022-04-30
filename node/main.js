const express = require('express')
const app = express()
const port = 3000
const mysql_dbc = require('./db_connection')();
const connection = mysql_dbc.init();
const cookieParser = require('cookie-parser');
const cookieConfig = {
    httpOnly: true,
    maxAge: 1000000,
};
app.use(cookieParser());
mysql_dbc.open(connection);

app.use(express.json());
app.use(express.urlencoded({ extended: false }));
app.get('/', async (req, res)=>{
    res.send('Hello World!')
})
app.get('/signin',async (req,res)=>{
    res.send(req.body);
})
app.post('/signin', (req,res)=>{
    const userid=req.body.userid;
    const password=req.body.password;
    let query = `select * from userinfo where userid='${userid}' and password='${password}'`
    connection.query(query, (err, result)=>{
        if(result.length==0) res.send('-1')
        else {
            res.cookie('userid', result[0].userid, cookieConfig);
            res.cookie('password', result[0].password, cookieConfig);
            res.cookie('nickname', result[0].nickname, cookieConfig);
            res.send('0')
        }

    })
})
app.listen(port, ()=>{
    console.log(`application is listening on port ${port}...`)
})
