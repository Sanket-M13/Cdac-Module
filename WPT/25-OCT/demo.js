console.log("Helloworld");

const obj = require('./mymodule.js');

// var sum = obj.sum(2,4);
// console.log(sum);
var prd = obj.product(40,4);
console.log(prd);

import { sum } from "mymodule.js";

var s = sum(4,5);
console.log(sum);
