const mysql = require('mysql');
const config = require('./db_info').real;

module.exports = ()=>{
    return {
        init: ()=>{
            return mysql.createConnection({
                host: config.host,
                port: config.port,
                user: config.user,
                password: config.password,
                database: config.database
            })
        },

        open: (con)=>{
            con.connect((err)=>{
                if (err) {
                    console.error('mysql connection error :' + err);
                } else {
                    console.info('mysql is connected successfully.');
                }
            })
        }
    }
};