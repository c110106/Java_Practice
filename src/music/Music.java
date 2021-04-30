package music;

public class Music {
    public static void tune(Instrument i){
        i.play(Note.MIDDLE_C);
    }

    public static void main(String args[]){
        Wind flute=new Wind();

        newInstrument ni = new newInstrument();
        ni.play(Note.B_FLAT);//验证多态性是否适用于所添加的新类型，答案是确实适用。
    }
}
