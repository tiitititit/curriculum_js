//チェックテスト 問1
let numbers = [2, 5, 12, 13, 15, 18, 22];
//ここに答えを実装してください。↓↓↓
function isEven(nums) {
    for (let i = 0; i < nums.length; i++) { 
         let number = nums[i];
    if (number % 2 === 0) {
        console.log(number + 'は偶数です');
}
}
}
isEven(numbers);

//チェックテスト 問2
class car{
    constructor(gass, number){
        this.gass = gass;
        this.number = number;
    }

   getNumGas() {
      console.log(`ガソリンは${this.gass}です。ナンバーは${this.number}です。`);
   }
}
let honda = new car('●●', '▲▲');
honda.getNumGas();