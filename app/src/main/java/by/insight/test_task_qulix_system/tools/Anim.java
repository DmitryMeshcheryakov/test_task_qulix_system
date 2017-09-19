package by.insight.test_task_qulix_system.tools;


import android.content.Context;
import android.support.annotation.AnimRes;
import android.support.v7.widget.RecyclerView;
import android.view.animation.AnimationUtils;
import android.view.animation.LayoutAnimationController;


public class Anim {
    public static void runLayoutAnimation(final RecyclerView recyclerView, Context context, @AnimRes int id) {
        context = recyclerView.getContext();
        final LayoutAnimationController controller =
                AnimationUtils.loadLayoutAnimation(context, id);
        recyclerView.setLayoutAnimation(controller);
        recyclerView.getAdapter().notifyDataSetChanged();
        recyclerView.scheduleLayoutAnimation();
    }
}
