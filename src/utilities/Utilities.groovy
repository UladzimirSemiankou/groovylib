package utilities.Utilities

class Utilities {
  static def classshare(script, var) {
    script.echo "i am shared class method. Var is ${var}"
    println "i am shared class method too. Var is ${var}"
  }
}
