**
 * Created by jsura on 24.05.2017.
 */

public class ReportCard {

    //attributes
    private int mathGrade;
    private int englishGrade;
    private int phisicsGrade;
    private int chemistryGrade;
    private int biologyGrade;
    private int artGrade;
    private int historyGrade;

    //constructor
    public ReportCard(int mathGrade, int englishGrade, int phisicsGrade, int chemistryGrade, int biologyGrade, int artGrade, int historyGrade) {

        this.mathGrade = validate(mathGrade);
        this.englishGrade = validate(englishGrade);
        this.phisicsGrade = validate(phisicsGrade);
        this.chemistryGrade = validate(chemistryGrade);
        this.biologyGrade = validate(biologyGrade);
        this.artGrade =  validate(artGrade);
        this.historyGrade = validate(historyGrade);
    }
    //getters and setters
    public int getMathGrade() {
        return mathGrade;
    }

    public void setMathGrade(int mathGrade) {
        this.mathGrade = validate(mathGrade);
    }

    public int getEnglishGrade() {
        return englishGrade;
    }

    public void setEnglishGrade(int englishGrade) {
        this.englishGrade = validate(englishGrade);
    }

    public int getPhisicsGrade() {
        return phisicsGrade;
    }

    public void setPhisicsGrade(int phisicsGrade) {
        this.phisicsGrade = validate(phisicsGrade);
    }

    public int getChemistryGrade() {
        return chemistryGrade;
    }

    public void setChemistryGrade(int chemistryGrade) {
        this.chemistryGrade = validate(chemistryGrade);
    }

    public int getBiologyGrade() {
        return biologyGrade;
    }

    public void setBiologyGrade(int biologyGrade) {
        this.biologyGrade = validate(biologyGrade);
    }

    public int getArtGrade() {
        return artGrade;
    }

    public void setArtGrade(int artGrade) {
        this.artGrade = validate(artGrade);
    }

    public int getHistoryGrade() {
        return historyGrade;
    }

    public void setHistoryGrade(int historyGrade) {
        this.historyGrade = validate(historyGrade);
    }

    //validate method (max grade couud be 100, min 0)

    private int validate(int grade){
        if(grade>100){
            grade=100;
        }
        if(grade<0) {
            grade = 0;
        }
        return grade;
    }
}
