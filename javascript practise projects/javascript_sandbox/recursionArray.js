var data = [1,2,3,4];

function recursionFlattenArray(arrayData){
if(arrayData.length != 0){
	console.log(arrayData[0]); // reads the current value
	arrayData.shift(); // removes the current value
    recursionFlattenArray(arrayData);
}
}

// returns 1,2,3,4
