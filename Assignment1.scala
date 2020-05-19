object assignment1{
	def main(args: Array[String]){
		def covertTemp(){
			var c = 35
			println("F = " + c * 1.8 + 32)
		}
		covertTemp
		
		def sphereVolume(){
			var r = 5
			println("Volume = " + 4.0/3.0 * math.Pi * r * r * r)
		}
		sphereVolume
			
		def calCost(){
			var copies = 60
			var salePrice = copies * 24.95 * 0.6
			if(copies > 50)
				println("Cost = " + salePrice + 50 * 3 + (copies - 50) * 0.75)
			else
				println("Cost = " + salePrice + copies * 3)
		}
		calCost
	}
}