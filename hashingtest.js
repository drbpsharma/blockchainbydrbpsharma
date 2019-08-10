// install nodejs and crypto-js module
// node hashingtest.js
const SHA256=require('crypto-js/sha256');
function hashing(s)
{
        return SHA256(s).toString();
}

console.log(hashing("1234"))
