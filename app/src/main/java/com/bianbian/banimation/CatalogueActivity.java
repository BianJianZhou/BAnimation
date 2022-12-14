package com.bianbian.banimation;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import com.bianbian.frameanimation.FrameActivity;
import com.bianbian.tweenanimation.TweenAnimModuleRouter;

public class CatalogueActivity extends Activity {

    /* 补间动画 */
    TextView compensationAnimationText;
    /* 帧动画 */
    TextView frameAnimationText;
    /* 属性动画 */
    TextView objectAnimationText;
    /* 其他动画 */
    TextView otherText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.catalogue_activity);

        bindView();
        setListener();
    }


    private void bindView() {
        compensationAnimationText = findViewById(R.id.compensation_animation_text);
        frameAnimationText = findViewById(R.id.frame_animation_text);
        objectAnimationText = findViewById(R.id.object_animation_text);
        otherText = findViewById(R.id.other_animation_text);
    }

    private void setListener() {
        compensationAnimationText.setOnClickListener(view -> {
            TweenAnimModuleRouter.startTweenAnimationActivity(this);
        });
        frameAnimationText.setOnClickListener(view -> {
            startActivity(new Intent(this, FrameActivity.class));
        });
        objectAnimationText.setOnClickListener(view -> {

        });
        otherText.setOnClickListener(view -> {

        });
    }
}