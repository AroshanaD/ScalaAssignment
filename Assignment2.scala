object assignment2{
	def main(args: Array[String]){
		def calIncome(normHrs: Int, otHrs: Int)={
			def normWage() = normHrs*150
			def otWage() = otHrs*75
			def totWage() = normWage + otWage
			def incomeWage() = totWage*0.9
			incomeWage
		}
		println("Income = Rs."+calIncome(40,20))
		
		def profTicket(tickPrice: Int)={
			def noAttend() = 120 + (15 - tickPrice)/5*20
			def revenue() = noAttend * tickPrice
			def costPerform() = 500 + 3 * noAttend
			revenue - costPerform
		}
		println("Profit(5) = Rs."+profTicket(5))
		println("Profit(10) = Rs."+profTicket(10))
		println("Profit(15) = Rs."+profTicket(15))
		println("Profit(20) = Rs."+profTicket(20))
		println("Profit(25) = Rs."+profTicket(25))
	}
}