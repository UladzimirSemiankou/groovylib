enum Level {DEBUG, INFO}

def debug(message) {
  if ((env.LogLevel as Level) <= Level.DEBUG) {
    println "[DEBUG]: ${message}"
  }
}

def info(message) {
  if ((env.LogLevel as Level) <= Level.INFO) {
    println "[INFO]: ${message}"
  }
}
