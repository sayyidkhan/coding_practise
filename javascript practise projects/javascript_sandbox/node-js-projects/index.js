var faker = require('faker');
var ChanceInit = require('chance');

var chance = new ChanceInit(); // init the file

for(var i = 0;i < 10; i++){
	var numInit = i + 1;
	var key = faker.finance.iban().substring(0,4);
	var uniqueName = chance.word({syllables: 2 });
	// var key = faker.finance.bitcoinAddress();
	console.log(numInit + "-" + uniqueName + "-" + key);
}

// referrences
// faker.js
// https://cdn.rawgit.com/Marak/faker.js/master/examples/browser/index.html

// chance.js
// https://chancejs.com/text/word.html

