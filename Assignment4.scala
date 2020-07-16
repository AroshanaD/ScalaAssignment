object Assignment4 {
  
  def main(args:Array[String]){
      
    //////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    val alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    
    //split the given string to words;
    val words = (x:String) => x.split(" ");
    
    //shift the letter along the "alphabet" according to the key
    val shift = (c:Char,key:Int,alph:String) => alph((alph.indexOf(c.toUpper)+key)%alph.size);
    
    //reshift the letter along the "alphabet" according to the key
    val reshift = (c:Char,key:Int,alph:String) => alph((alph.indexOf(c.toUpper)-key)%alph.size);
    
    //shift all the letters in Array[String] accorging to key to encrypt and return an Array[String] of encrypted words
    val encrypt = (l:Array[String],key:Int,alph:String) => l.map(x => x.map(y => shift(y,key,alph)));
    
    //reshift all the letters in Array[String] accorging to key to decrypt and return an Array[String] of decrypted words
    val decrypt = (l:Array[String],key:Int,alph:String) => l.map(x => x.map(y => reshift(y,key-alph.size,alph)));
    
    //take encrypt or decrypt functions and map values to function parameters and reduce the Array[String] to one String
    val cypher = (algo:(Array[String],Int,String)=>Array[String],l:String,key:Int,alph:String) => algo(words(l),key,alph).reduce((x,y)=>x+" "+y);
    /////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    
    val message1 = "This is Scala";
    
    val message2 = "Caesar cypher implement";
    
    val encrypted1 = cypher(encrypt,message1,6,alphabet);
    
    val decrypted1 = cypher(decrypt,encrypted1,6,alphabet);
    
    println(encrypted1);
    
    println(decrypted1);
    
    val encrypted2 = cypher(encrypt,message2,4,alphabet);
    
    val decrypted2 = cypher(decrypt,encrypted2,4,alphabet);
    
    println(encrypted2);
    
    println(decrypted2);
  
  }
}