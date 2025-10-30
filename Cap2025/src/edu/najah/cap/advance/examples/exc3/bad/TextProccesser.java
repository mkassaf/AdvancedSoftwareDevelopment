package edu.najah.cap.advance.examples.exc3.bad;

public class TextProccesser {

    private IToLowerCaseFilter filter;
    private IMaskFilter filter2;
    private ITrimFilter filter3;
    private ISalahFilter filter4;

    public  TextProccesser(IToLowerCaseFilter filter1, IMaskFilter filter2, ITrimFilter filter3, ISalahFilter filter4) {
        this.filter = filter1;
        this.filter2 = filter2;
        this.filter3 = filter3;
        this.filter4 = filter4;
    }


    public String proccess(String text) {
        String result = text;

        result = filter.applyToLowerCaseFilter(result);
        result = filter3.applyTrimFilter(result);
        result = filter2.applyMaskFilter(result);
        result = filter4.applySalah(result);

        return result;

    }


}
