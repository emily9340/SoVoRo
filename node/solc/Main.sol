// SPDX-License-Identifier: UNLICENSED
pragma solidity ^0.8.0;

contract Main {
    address owner;
    address receiver;
    uint ownerBalance;
    uint contractBalance;
    event ReceiveEvent(address _address,uint _value,string _string);
    event FallbackEvent(address _address,uint _value,string _string);
    receive() external payable {
        emit ReceiveEvent(msg.sender,msg.value,"receive event called");
    }
    fallback() external payable {
        emit FallbackEvent(msg.sender,msg.value,"fallback event called");
    }
    constructor() {
        owner=msg.sender;
    }
    function deposit(uint value) public payable isCorrectValue(value) {
        contractBalance+=value;
    }
    function withdraw(address _receiver,uint value) public payable {
        payable(_receiver).transfer(value);
        contractBalance-=value;
    }
    function getContractbalance() public view returns(uint,uint) {
        return (address(this).balance,contractBalance);
    }
    function getAddressBalance(address _address) public view returns(uint) {
        return _address.balance;
    }
    modifier isCorrectValue(uint value) {
        require(value==msg.value,"incorrect value");
        _;
    }
    modifier isOwne() {
        require(msg.sender==owner,"message sender is not owner");
        _;
    }
}
