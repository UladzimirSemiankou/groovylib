enum Level {DEBUG, INFO}
def lev

def setLevel(level) {
    lev = level
}

def debug(message) {
  if (lev <= Level.DEBUG) {
    println "[DEBUG]: ${message}"
  }
}

def info(message) {
  if (lev <= Level.INFO) {
    println "[INFO]: ${message}"
  }
}
