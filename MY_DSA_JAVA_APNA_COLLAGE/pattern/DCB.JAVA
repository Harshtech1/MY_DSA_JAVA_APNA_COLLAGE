PUBLIC CLASS BCD{
    public static void DECIMALTOBINARY(INT N){
        INT BINARYNUM=0;
        INT POWER=0;
        INT NUM=N;
        WHILE(NUM>0){
            INT REMAINDER=NUM%2;
            BINARYNUM=BINARYNUM+(REMAINDER*(INT)MATH.POW(10,POWER));
            POWER++;
            NUM=NUM/2;
        }
        SYSTEM.OUT.PRINTLN("binary form of "+N+"is"+BINARYNUM);
    }

    PUBLIC STATIC VOID MAIN(STRING[] ARGS){
        system.out.println(s);
        DECIMALTOBINARY(10);
        int s=10;
        system.out.println(s);
 
    }
}