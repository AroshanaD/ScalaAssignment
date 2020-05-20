object assignment1{
	def main(args: Array[String]){
		def covertTemp(){
			val C = 35
			var F = C * 1.8 + 32
			println(F)
		}
		covertTemp
		
		def sphereVolume(){
			val r = 5.0
			var Volume = 4.0/3.0 * math.Pi * r * r * r
			println(Volume)
		}
		sphereVolume
			
		def calCost(){
			val copies = 60
			var salePrice = copies * 24.950 * 0.60
			var Cost = 0.0
			if(copies > 50)
				Cost = salePrice + 50 * 3 + (copies - 50) * 0.75
			else
				Cost = salePrice + copies * 3
			println(Cost)
		}
		calCost
	}
}