//문제 40

//문제 41
class Exam41 {
    num = 0;

    constructor(num) {
        this.number = num;
    }
    check() {
        for(let i = this.number-1; i>=2; i--) {
            if ( this.number % i == 0 ) {
                console.log("소수가 아니다.");
            }
            else console.log("소수이다.")
        }
    }
}

let exam41 = new Exam41(prompt("소수인지 아닌지 확인할 숫자를 입력하세요."));
exam41.check();

//class Exam41 {
//    number = 0;
//    countFriends = 0;
//    arrFriendWeights = [];
//
//    constructor(number) {
//    // new Exam41(a);
//    // Exam41 클래스를 인스턴스객체로 생성하는 비 기본생성자
//        this.number = Number(number);
//    }
//
//    solve() {
//        for( ...... ) {
//            // this.number 를 하나씩 뺀 값을 이용하여
//            // this.number % this.number - 1 === 0 ===> 나머지가 0이면 소수가 아님
//            // this.number % this.number - 2 === 0 ===> 나머지가 0이면 소수가 아님
//            // this.number % this.number - 3 === 0 ===> 나머지가 0이면 소수가 아님
//            // this.number % 2 === 0    ===> 2 까지 수행해본다.
//        }
//    }
//}
//문제 42
