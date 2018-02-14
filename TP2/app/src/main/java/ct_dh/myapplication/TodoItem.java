package ct_dh.myapplication;

/**
 * Created by Clement on 12/02/2018.
 */

public class TodoItem {

    private String label;
    private int Tags; // 0 faible  1 normal  2 imoprtant
    private boolean realisee;

    public TodoItem(int tag, String label) {
        this.label = label;
        this.Tags = tag;
        this.realisee = false;
    }

    public String getLabel() {
        return label;
    }

    public int getTag() {
        return Tags;
    }

    public boolean isRealisee() {
        return realisee;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public void setTag(int tag) {
        this.Tags = tag;
    }

    public void setRealisee(boolean realisee) {
        this.realisee = realisee;
    }
}
