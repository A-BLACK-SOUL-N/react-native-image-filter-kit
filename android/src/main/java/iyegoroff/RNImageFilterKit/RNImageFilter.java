package iyegoroff.RNImageFilterKit;

import android.content.Context;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.Canvas;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.facebook.react.common.ReactConstants;
import com.facebook.react.views.view.ReactViewGroup;
import com.facebook.react.views.image.ReactImageView;
import com.facebook.react.bridge.ReadableArray;

import com.facebook.drawee.view.GenericDraweeView;

public class RNImageFilter extends ReactViewGroup {

  public RNImageFilter(Context context) {
    super(context);
  }

  @Override
  protected void onLayout(boolean changed, int left, int top, int right, int bottom) {
    Log.i(ReactConstants.TAG, "filter: layout");

    for (int i = 0; i < this.getChildCount(); i++) {
      View child = this.getChildAt(i);

      if (child instanceof GenericDraweeView) {
        Log.i(ReactConstants.TAG, "filter: drawee");
      }
    }
  }


//  private float[] mMatrix = {
//    1, 0, 0, 0, 0,
//    0, 1, 0, 0, 0,
//    0, 0, 1, 0, 0,
//    0, 0, 0, 1, 0
//  };
//
//  public RNImageFilter(Context context) {
//    super(context);
//  }
//
//  public void setMatrix(ReadableArray matrix) {
//    mMatrix = new float[matrix.size()];
//
//    for (int i = 0; i < mMatrix.length; i++) {
//      mMatrix[i] = (float) matrix.getDouble(i);
//    }
//
//    invalidate();
//
//    // invalidateAllImageMatrixFilterChildren(this);
//  }
//
//  @Override
//  public void draw(Canvas canvas) {
//    useColorFilterOnAllChildren(
//      this,
//      new ColorMatrixColorFilter(new ColorMatrix(mMatrix))
//      // new ColorMatrixColorFilter(calculateColorMatrix(this, new ColorMatrix(mMatrix)))
//    );
//
//    super.draw(canvas);
//  }
//
//  // private ColorMatrix calculateColorMatrix(ViewGroup target, ColorMatrix currentMatrix) {
//  //   ViewParent parent = target.getParent();
//
//  //   if (parent instanceof ViewGroup) {
//  //     if (parent instanceof RNImageMatrixFilterView) {
//  //       currentMatrix.postConcat(new ColorMatrix(((RNImageMatrixFilterView) parent).mMatrix));
//  //     }
//
//  //     return calculateColorMatrix((ViewGroup) parent, currentMatrix);
//  //   }
//
//  //   // Log.v(ReactConstants.TAG, Arrays.toString(currentMatrix.getArray()));
//
//  //   return currentMatrix;
//  // }
//
//  private void useColorFilterOnAllChildren(ViewGroup parent, ColorMatrixColorFilter filter) {
//    for (int i = 0; i < parent.getChildCount(); i++) {
//      View child = parent.getChildAt(i);
//
//      if (child instanceof ImageView) {
//        ((ImageView) child).setColorFilter(filter);
//
//      } else if (child instanceof RNImageFilter) {
//        return;
//
//      } else if (child instanceof ViewGroup) {
//        useColorFilterOnAllChildren((ViewGroup) child, filter);
//      }
//    }
//  }
//
//  private void invalidateAllImageMatrixFilterChildren(ViewGroup parent) {
//    for (int i = 0; i < parent.getChildCount(); i++) {
//      View child = parent.getChildAt(i);
//
//      if (child instanceof RNImageFilter) {
//        ((RNImageFilter) child).invalidate();
//      }
//
//      if (child instanceof ViewGroup) {
//        invalidateAllImageMatrixFilterChildren((ViewGroup) child);
//      }
//    }
//  }
}