// SPDX-License-Identifier: UNLICENSED
pragma solidity ^0.8.0;

contract Main {
    address owner;
    address receiver;
    uint ownerBalance;
    uint contractBalance;
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
    function getContractbalance() public view returns(uint) {
        return address(this).balance;
    }
    function getAddressBalance(address _address) public view returns(uint) {
        return _address.balance;
    }
    modifier isCorrectValue(uint value) {
        require(value==msg.value,"incorrect value");
        _;
    }
}
