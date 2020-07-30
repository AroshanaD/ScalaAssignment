object Assignment5 {
  def main(args:Array[String]){
    class Rational(x:Int,y:Int){
      def this(x:Int) = this(x,1);
      require(y>0,"denominator must be positive");
      private def gcd(a:Int,b:Int):Int = if(b==0) a else gcd(b,a%b);
      private val g = gcd(if(x>0) x else -x,y);
      def numerator = x/g;
      def denominator= y/g;
      def +(z:Rational) = new Rational(this.numerator*z.denominator + this.denominator*z.numerator,this.denominator*z.denominator);
      def -(z:Rational) = this+z.neg;
      def *(z:Rational) = new Rational(this.numerator*z.numerator,this.denominator*z.denominator);
      def /(z:Rational) = new Rational(this.numerator*z.denominator,this.denominator*z.numerator);
      def neg = new Rational(-this.numerator,this.denominator);
      override def toString = s"$numerator/$denominator";
    }
    
    var l = new Rational(3,4);
    var m = new Rational(5,8);
    var n = new Rational(2,7);
    
    println("Rational Q: "+(l-m-n));
    println(" ");

///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    class Account(x:String,y:Int,z:Double){
      require(y>0,"Wrong account number");
      def this(x:String,y:Int) = this(x,y,0.00)
      val nic = x;
      val acc_num = y;
      var balance = z;

      def withdraw(x:Double) = this.balance = this.balance - x;
      def deposit(x:Double) = this.balance = this.balance + x;
      def transfer(a:Account, x:Double)={ this.withdraw(x); a.deposit(x);}
      override def toString = "["+nic+" : "+acc_num +" : "+ balance+"]"
    }

    var a = new Account("123v",123,3987.90);
    var b = new Account("868v",868,569.80);
    var c = new Account("5667v",566,-215.45);
    var d = new Account("996v",996,-54.43);
    var e = new Account("090v",190,8799.14);

    var bank:List[Account] = List(a,b,c,d,e);

    println(bank);

    a.withdraw(7);
    println("withdraw 7 from a "+a);
    a.deposit(7);
    println("Deposit 7 to a "+a);
    a.transfer(b,7);
    println("Transfer 7 from a to b "+a+" "+b);
    b.transfer(a,7);
    println("Transfer 7 from b to a "+b+" "+a+"\n");

    val  find = (x:String,l:List[Account]) => l.filter(y=>y.nic.equals(x));

    val overdraft = (l:List[Account]) => l.filter(y=>y.balance < 0);

    val balance = (l:List[Account]) => (l.map(x=>x.balance)).reduce((x,y)=>x+y);

    val int_perc = (x:Double) => if(x > 0) x*0.05 else x*0.1;

    val interest = (l:List[Account]) => l.map(x=>x.deposit(int_perc(x.balance)));
    
    println("Overdraft: "+overdraft(bank));
    println("Balance: "+balance(bank));
    println("Before Interest: "+bank);
    interest(bank);
    println("After Interest: "+bank);
    }
}
