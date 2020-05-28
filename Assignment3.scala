object assignment3{
	def main(args: Array[String]){
		def boolPrime(num:Int,x:Int=2):Boolean={
			def gcd(a:Int,b:Int):Int=b match{
				case 0 => a
				case b => gcd(b,a%b)
			}
			x match{
				case x if(x==num) => true
				case x if(gcd(num,x)>1) => false
				case x => boolPrime(num,x+1)
			}
		}
		println("5 prime? " + boolPrime(5))
		println("17 prime? " + boolPrime(17))
		println("12 prime? " + boolPrime(12))
		
		def primeSeq(num:Int):Unit={
			def boolPrime(x:Int=2):Boolean={
				def gcd(a:Int,b:Int):Int=b match{
					case 0 => a
					case b => gcd(b,a%b)
				}
				x match{
					case x if(x==num) => true
					case x if(gcd(num,x)>1) => false
					case x => boolPrime(x+1)
				}
			}
			if(boolPrime(2))print(num+" ")
			if(num>2)primeSeq(num-1) else return
		}
		println("primes upto 10: ")
		primeSeq(10)
		
		def addNum(num:Int):Int=num match{
			case num if(num>0) => num + addNum(num-1)
			case num => num
		}
		println("\nSum of 1 to 5 = " + addNum(5))
		
		def evenOdd(num:Int):String=num match{
			case num if(num==0) => "even"
			case num if(num==1) => "odd"
			case num => evenOdd(num-2)
		}
		println("5 even or odd? " + evenOdd(5))
		
		def evenSum(num:Int):Int={
			def evenOdd(num:Int):String=num match{
				case num if(num==0) => "even"
				case num if(num==1) => "odd"
				case num => evenOdd(num-2)
			}
			def addNum(num:Int):Int=num match{
				case num if(num>0) => num + addNum(num-2)
				case num => num
			}
			if(evenOdd(num)=="even") addNum(num)
			else addNum(num-1)
		}
		println("Sum of even numbers upto 10 = " + evenSum(10))
		
		def fibSeries(num:Int):Unit={
			def fibNum(num:Int):Int=num match{
				case num if(num==0) => 0
				case num if(num==1) => 1
				case _ => fibNum(num-1) + fibNum(num-2)
			}
			if(num>0) fibSeries(num-1)
			print(fibNum(num)+" ")
		}
		println("Fibonacci Series(10) : ")
		fibSeries(10)
	}
}