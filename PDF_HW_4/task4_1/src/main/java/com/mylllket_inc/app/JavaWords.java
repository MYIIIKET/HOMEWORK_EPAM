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
//    PRIMITIVES_REGEX(BYTE.getName() + "|" + SHORT.getName() + "|" + INT.getName() + "|" + LONG.getName() +
//            "|" + CHAR.getName() + "|" + FLOAT.getName() + "|" + DOUBLE.getName() + "|" + BOOLEAN.getName()),

    WHILE("while"),
    DO("do"),
    BREAK("break"),
    CONTINUE("continue"),
    FOR("for"),
//    LOOP_REGEX(WHILE.getName() + "|" + DO.getName() + "|" + BREAK.getName() + "|" + CONTINUE.getName() + "|" + FOR.getName()),


    IF("if"),
    ELSE("else"),
    SWITCH("switch"),
    CASE("case"),
    DEFAULT("default"),
//    BRANCHES_REGEX(IF.getName() + "|" + ELSE.getName() + "|" + SWITCH.getName() + "|" + CASE.getName() + "|" + DEFAULT.getName()),


    TRY("try"),
    CATCH("catch"),
    FINALLY("finally"),
    THROW("throw"),
    THROWS("throws"),
//    EXCEPTIONS_REGEX(TRY.getName() + "|" + CATCH.getName() + "|" + FINALLY.getName() + "|" + THROW.getName() + "|" + THROWS.getName()),


    PRIVATE("private"),
    PROTECTED("protected"),
    PUBLIC("public"),
//    SCOPES_REGEX(PRIVATE.getName() + "|" + PROTECTED.getName() + "|" + PUBLIC.getName()),


    IMPORT("import"),
    PACKAGE("package"),
//    IMPORT_REGEX(IMPORT.getName() + "|" + PACKAGE.getName()),


    CLASS("class"),
    INTERFACE("interface"),
    EXTENDS("extends"),
    IMPLEMENTS("implements"),
    STATIC("static"),
    FINAL("final"),
    VOID("void"),
    ABSTRACT("abstract"),
    NATIVE("native"),
//    DECLARATION_REGEX(CLASS.getName() + "|" + INTERFACE.getName() + "|" + EXTENDS.getName() + "|" +
//            IMPLEMENTS.getName() + "|" + STATIC.getName() + "|" + FINAL.getName() + "|" +
//            VOID.getName() + "|" + ABSTRACT.getName() + "|" + NATIVE.getName()),


    NEW("new"),
//    CREATE_REGEX(NEW.getName()),


    RETURN("return"),
    THIS("this"),
//    RETURN_REGEX(RETURN.getName() + "|" + THIS.getName()),


    SUPER("super"),
//    CALL_REGEX(SUPER.getName()),


    SYNCHRONIZED("synchronized"),
    VOLATILE("volatile"),
//    MULTITHREADING_REGEX(SYNCHRONIZED.getName() + "|" + VOLATILE.getName()),


    CONST("const"),
    GOTO("goto"),
//    RESERVED_REGEX(CONST.getName() + "|" + GOTO.getName()),


    INSTANCEOF("instanceof"),
    ENUM("enum"),
    ASSERT("assert"),
    TRANSIENT("transient"),
    STRICTFP("strictfp");
//    OTHER_REGEX(INSTANCEOF.getName() + "|" + ENUM.getName() + "|" + ASSERT.getName() + "|" + TRANSIENT.getName() + "|" + STRICTFP.getName()),

//    REGEX(PRIMITIVES_REGEX.getName() + "|" +
//            LOOP_REGEX.getName() + "|" +
//            BRANCHES_REGEX.getName() + "|" +
//            EXCEPTIONS_REGEX.getName() + "|" +
//            SCOPES_REGEX.getName() + "|" +
//            IMPORT_REGEX.getName() + "|" +
//            DECLARATION_REGEX.getName() + "|" +
//            CREATE_REGEX.getName() + "|" +
//            RETURN_REGEX.getName() + "|" +
//            CALL_REGEX.getName() + "|" +
//            MULTITHREADING_REGEX.getName() + "|" +
//            RESERVED_REGEX.getName() + "|" +
//            OTHER_REGEX.getName());


    private String name;

    private JavaWords(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }
}
