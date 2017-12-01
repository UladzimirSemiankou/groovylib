enum Level {DEBUG, INFO}

def LogLevel = env.LogLevel as Level

def debug(message) {
  if (LogLevel <= Level.DEBUG) {
    println "[DEBUG]: ${message}"
  }
}

def info(message) {
  if (LogLevel <= Level.INFO) {
    println "[INFO]: ${message}"
  }
}
