enum Level {DEBUG, INFO}
def levels = env.LogLevel as Level
def debug(message) {
  if (levels <= Level.DEBUG) {
    println "[DEBUG]: ${message}"
  }
}

def info(message) {
  if (levels <= Level.INFO) {
    println "[INFO]: ${message}"
  }
}
