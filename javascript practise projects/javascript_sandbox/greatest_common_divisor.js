function gcd(num1,num2){


if(num1 > num2){
let placeholder = num1;
num1 = num2;
num2 = placeholder;
}

if(num1 >= 10){
let remainder = 1;
while(remainder != 0){
remainder = num2 % num1;
num2 = num1;
num1 = remainder;
}

return num2;
}
return -1;
}

// to calculate Greatest Common Divisor;
// returns -1 if num1 is less than 10;