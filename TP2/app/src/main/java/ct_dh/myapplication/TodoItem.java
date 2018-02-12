package ct_dh.myapplication;

/**
 * Created by Clement on 12/02/2018.
 */

public class TodoItem {

    private String label;
    private int tag;
    private boolean realisee;

    public TodoItem(String label, int tag) {
        this.label = label;
        this.tag = tag;
        this.realisee = false;
    }

    public String getLabel() {
        return label;
    }

    public int getTag() {
        return tag;
    }

    public boolean isRealisee() {
        return realisee;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public void setTag(int tag) {
        this.tag = tag;
    }

    public void setRealisee(boolean realisee) {
        this.realisee = realisee;
    }
}
