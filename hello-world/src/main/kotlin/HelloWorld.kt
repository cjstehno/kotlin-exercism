fun hello(name: String = ""): String {
    return "Hello, ${if (name.trim() != "") name else "World"}!"
}
