//문제 27
class Exam27 {
    maps = new Map();

    inputFunc() {
        let names = prompt("이름을 공백으로 구분하여 입력하세요.");
        let score = prompt("점수를 공백으로 구분하여 입력하세요.");
        let arrName = names.split(" ");
        let arrScore = score.split(" ");
        if (arrName.length != arrScore.length) {
            alert("두개 배열의 길이가 다릅니다. 다시 시작하세요.");
            return false;   // 함수가 false 를 리턴한다.
        }
        this.maps.set(arrName[0], Number(arrScore[0]));
        this.maps.set(arrName[1], Number(arrScore[1]));
        console.log(this.maps);
        return true;
    }

    outputFunc() {
        let strOutput = "{";
        for( let item of this.maps ){
            console.log(item);
            strOutput += `'${item[0]}:${item[1]},`
        }
        strOutput = strOutput.substring(0, strOutput.length - 2);

        strOutput += "}";
        console.log(strOutput);
    }
}
let exam27 = new Exam27();
if ( exam.inputFunc() ) {
    exam.outputFunc();
}

//답안
//const keys = prompt('이름을 입력하세요').split(' ');
//const values = prompt('점수를 입력하세요').split(' ');
//const obj = {};
//
//for (let i=0; i<keys.length; i++) {
//  obj[keys[i]] = parseInt(values[i], 10);
//}
//
//console.log(obj);

//문제 28
class Exam28 {
    strInput = "";
    constructor(str) {
        this.strInput = str;
    }
    output() {
        // 루프를 이용하여 문자열 2글자씩 출력한다.
        for (let i = 0; i < this.strInput.length - 1; i++) {
            let strOutput = this.strInput[i] + " " + this.strInput[i + 1] + "\n";
            console.log(strOutput);
        }
    }
}

let exam28 = new Exam28(prompt("문자열 입력하세요."));
exam28.output(); // output 메서드 호출
