package com.mylllket_inc.app;


enum JavaWords {

    BYTE("byte"),
    SHORT("short"),
    INT("int"),
    LONG("long"),
    CHAR("char"),
    FLOAT("float"),
    DOUBLE("double"),
    BOOLEAN("boolean"),

    WHILE("while"),
    DO("do"),
    BREAK("break"),
    CONTINUE("continue"),
    FOR("for"),


    IF("if"),
    ELSE("else"),
    SWITCH("switch"),
    CASE("case"),
    DEFAULT("default"),


    TRY("try"),
    CATCH("catch"),
    FINALLY("finally"),
    THROW("throw"),
    THROWS("throws"),


    PRIVATE("private"),
    PROTECTED("protected"),
    PUBLIC("public"),


    IMPORT("import"),
    PACKAGE("package"),


    CLASS("class"),
    INTERFACE("interface"),
    EXTENDS("extends"),
    IMPLEMENTS("implements"),
    STATIC("static"),
    FINAL("final"),
    VOID("void"),
    ABSTRACT("abstract"),
    NATIVE("native"),


    NEW("new"),


    RETURN("return"),
    THIS("this"),


    SUPER("super"),


    SYNCHRONIZED("synchronized"),
    VOLATILE("volatile"),


    CONST("const"),
    GOTO("goto"),


    INSTANCEOF("instanceof"),
    ENUM("enum"),
    ASSERT("assert"),
    TRANSIENT("transient"),
    STRICTFP("strictfp");


    private String name;

    private JavaWords(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }
}
