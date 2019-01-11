var input = 10;

function recursion(input){
if(input == 1){
console.log("recursion stopped");
}
else{
input--;
console.log(input);
recursion(input);
}

}

recursion(10);
// 9
// 8
// 7
// 6
// 5
// 4
// 3
// 2
// 1
// recursion stopped

