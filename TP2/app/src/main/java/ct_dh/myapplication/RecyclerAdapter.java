package ct_dh.myapplication;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;


/**
 * Created by David on 14/02/2018.
 */

public class RecyclerAdapter extends RecyclerView.Adapter<RecyclerAdapter.TodoItemHolder> {

    private ArrayList<TodoItem> liste;

    public RecyclerAdapter(ArrayList<TodoItem> liste) {
        this.liste = liste;
    }

    @Override
    public TodoItemHolder onCreateViewHolder (ViewGroup parent , int viewType ) {
        return null ;
    }

    @Override
    public void onBindViewHolder ( TodoItemHolder holder , int position ) {

    }

    @Override
    public int getItemCount () {
        return 0;
    }

    public static class TodoItemHolder extends RecyclerView.ViewHolder {
        public TodoItemHolder ( View itemView ) {
            super (itemView) ;

        }

        public View getView ( int position , View convertView , ViewGroup parent ) {
            ViewHolder holder ;

            if (convertView == null) {
                convertView = inflat.inflate(R.layout.row, null);
                holder = new ViewHolder();
                holder.categ = (TextView)convertView.findViewById( R.id.itemcateg);
                holder.name = (TextView)convertView.findViewById( R.id.itemname ) ;
                convertView.setTag(holder);
                }
            else
            holder = (ViewHolder)convertView.getTag();
                        Product p = ( Product ) getItem(position);
            holder.categ.setText(p.getCategory());
            holder.name.setText(p.getTitle());
                        return convertView ;
            }

    }
}
