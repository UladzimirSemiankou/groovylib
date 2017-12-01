enum Level {DEBUG, INFO}

def debug(message) {
  if (env.LogLevel <= Level.DEBUG) {
    println "[DEBUG]: ${message}"
  }
}

def info(message) {
  if (env.LogLevel <= Level.INFO) {
    println "[INFO]: ${message}"
  }
}
