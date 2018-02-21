package ct_dh.myapplication;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.Switch;
import android.widget.TextView;
import android.content.res.Resources;
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
        View inflatedView = LayoutInflater.from(parent.getContext()).inflate(R.layout.row.xml);
        return new TodoItemHolder(inflatedView);
    }

    @Override
    public void onBindViewHolder ( TodoItemHolder holder , int position ) {
        TodoItem it = liste.get(position);
        holder.bindTodo(it);
    }

    @Override
    public int getItemCount () {
        return liste.size();
    }

    public static class TodoItemHolder extends RecyclerView.ViewHolder {

        private Resources ressources;
        private ImageView image;
        private Switch sw;
        private TextView label;
        private TodoItem item;

        public TodoItemHolder ( View itemView ) {
            super (itemView) ;

            image = (ImageView) itemView.findViewById(R.id.imageView);
            sw = (Switch) itemView.findViewById(R.id.textView);
            label = (TextView) itemView.findViewById(R.id.textView);
            ressources = itemView.getResources();
        }

        public void bindTodo(TodoItem todo){
            label.setText(todo.getLabel());
            sw.setChecked(todo.isRealisee());
            switch(todo.getTag()){
                case faible:
                    image.setBackgroundColor(ressources.getColor(R.color.faible));
                    break;
                case fort:
                    image.setBack
            }
        }

        public View getView ( int position , View convertView , ViewGroup parent ) {
            RecyclerView.ViewHolder holder ;

            if (convertView == null) {
                convertView = inflat.inflate(R.layout.row, null);
                holder = new RecyclerView.ViewHolder();
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
