//
// DO NOT EDIT THIS FILE, IT HAS BEEN GENERATED USING AndroidAnnotations 3.0-SNAPSHOT.
//


package com.opentaxi.android;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.support.v4.app.Fragment;
import android.view.KeyEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup.LayoutParams;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.Spinner;
import android.widget.TextView;
import com.opentaxi.android.R.id;
import com.opentaxi.android.R.layout;
import com.opentaxi.generated.mysql.tables.pojos.Groups;
import com.opentaxi.generated.mysql.tables.pojos.Regions;
import org.androidannotations.api.BackgroundExecutor;
import org.androidannotations.api.SdkVersionHelper;
import org.androidannotations.api.view.HasViews;
import org.androidannotations.api.view.OnViewChangedListener;
import org.androidannotations.api.view.OnViewChangedNotifier;

public final class NewRequestActivity_
    extends NewRequestActivity
    implements HasViews, OnViewChangedListener
{

    private final OnViewChangedNotifier onViewChangedNotifier_ = new OnViewChangedNotifier();
    private Handler handler_ = new Handler(Looper.getMainLooper());

    private void init_(Bundle savedInstanceState) {
        OnViewChangedNotifier.registerOnViewChangedListener(this);
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        OnViewChangedNotifier previousNotifier = OnViewChangedNotifier.replaceNotifier(onViewChangedNotifier_);
        init_(savedInstanceState);
        super.onCreate(savedInstanceState);
        OnViewChangedNotifier.replaceNotifier(previousNotifier);
        setContentView(layout.new_request);
    }

    @Override
    public void setContentView(int layoutResID) {
        super.setContentView(layoutResID);
        onViewChangedNotifier_.notifyViewChanged(this);
    }

    @Override
    public void setContentView(View view, LayoutParams params) {
        super.setContentView(view, params);
        onViewChangedNotifier_.notifyViewChanged(this);
    }

    @Override
    public void setContentView(View view) {
        super.setContentView(view);
        onViewChangedNotifier_.notifyViewChanged(this);
    }

    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        if (((SdkVersionHelper.getSdkInt()< 5)&&(keyCode == KeyEvent.KEYCODE_BACK))&&(event.getRepeatCount() == 0)) {
            onBackPressed();
        }
        return super.onKeyDown(keyCode, event);
    }

    public static NewRequestActivity_.IntentBuilder_ intent(Context context) {
        return new NewRequestActivity_.IntentBuilder_(context);
    }

    public static NewRequestActivity_.IntentBuilder_ intent(Fragment supportFragment) {
        return new NewRequestActivity_.IntentBuilder_(supportFragment);
    }

    @Override
    public void onViewChanged(HasViews hasViews) {
        regionsPicker = ((Spinner) hasViews.findViewById(id.regionsPicker));
        region = ((TextView) hasViews.findViewById(id.region));
        pbProgress = ((ProgressBar) hasViews.findViewById(id.pbProgress));
        address = ((TextView) hasViews.findViewById(id.address));
        addressText = ((EditText) hasViews.findViewById(id.addressText));
        addressChange = ((Button) hasViews.findViewById(id.addressChange));
        reqInfoButtonContainer = ((LinearLayout) hasViews.findViewById(id.reqInfoButtonContainer));
        pricesPicker = ((Spinner) hasViews.findViewById(id.pricesPicker));
        llFilters = ((LinearLayout) hasViews.findViewById(id.llFilters));
        if (hasViews.findViewById(id.addressChange)!= null) {
            hasViews.findViewById(id.addressChange).setOnClickListener(new OnClickListener() {


                @Override
                public void onClick(View view) {
                    NewRequestActivity_.this.addressChange();
                }

            }
            );
        }
        if (hasViews.findViewById(id.requestSend)!= null) {
            hasViews.findViewById(id.requestSend).setOnClickListener(new OnClickListener() {


                @Override
                public void onClick(View view) {
                    NewRequestActivity_.this.requestSend();
                }

            }
            );
        }
        afterActivity();
    }

    @Override
    public void showRegions(final Regions[] regions) {
        handler_.post(new Runnable() {


            @Override
            public void run() {
                NewRequestActivity_.super.showRegions(regions);
            }

        }
        );
    }

    @Override
    public void showGroups(final Groups[] groups) {
        handler_.post(new Runnable() {


            @Override
            public void run() {
                NewRequestActivity_.super.showGroups(groups);
            }

        }
        );
    }

    @Override
    public void showPrices(final Groups[] prices) {
        handler_.post(new Runnable() {


            @Override
            public void run() {
                NewRequestActivity_.super.showPrices(prices);
            }

        }
        );
    }

    @Override
    public void SuccessDialog() {
        handler_.post(new Runnable() {


            @Override
            public void run() {
                NewRequestActivity_.super.SuccessDialog();
            }

        }
        );
    }

    @Override
    public void showAddress(final com.opentaxi.generated.mysql.tables.pojos.NewRequest adr) {
        handler_.post(new Runnable() {


            @Override
            public void run() {
                NewRequestActivity_.super.showAddress(adr);
            }

        }
        );
    }

    @Override
    public void setAddress() {
        BackgroundExecutor.execute(new BackgroundExecutor.Task("", 0, "") {


            @Override
            public void execute() {
                try {
                    NewRequestActivity_.super.setAddress();
                } catch (Throwable e) {
                    Thread.getDefaultUncaughtExceptionHandler().uncaughtException(Thread.currentThread(), e);
                }
            }

        }
        );
    }

    @Override
    public void sendRequest(final com.opentaxi.models.NewRequest newRequest) {
        BackgroundExecutor.execute(new BackgroundExecutor.Task("", 0, "") {


            @Override
            public void execute() {
                try {
                    NewRequestActivity_.super.sendRequest(newRequest);
                } catch (Throwable e) {
                    Thread.getDefaultUncaughtExceptionHandler().uncaughtException(Thread.currentThread(), e);
                }
            }

        }
        );
    }

    @Override
    public void setRegions() {
        BackgroundExecutor.execute(new BackgroundExecutor.Task("", 0, "") {


            @Override
            public void execute() {
                try {
                    NewRequestActivity_.super.setRegions();
                } catch (Throwable e) {
                    Thread.getDefaultUncaughtExceptionHandler().uncaughtException(Thread.currentThread(), e);
                }
            }

        }
        );
    }

    @Override
    public void setPrices() {
        BackgroundExecutor.execute(new BackgroundExecutor.Task("", 0, "") {


            @Override
            public void execute() {
                try {
                    NewRequestActivity_.super.setPrices();
                } catch (Throwable e) {
                    Thread.getDefaultUncaughtExceptionHandler().uncaughtException(Thread.currentThread(), e);
                }
            }

        }
        );
    }

    @Override
    public void setGroups() {
        BackgroundExecutor.execute(new BackgroundExecutor.Task("", 0, "") {


            @Override
            public void execute() {
                try {
                    NewRequestActivity_.super.setGroups();
                } catch (Throwable e) {
                    Thread.getDefaultUncaughtExceptionHandler().uncaughtException(Thread.currentThread(), e);
                }
            }

        }
        );
    }

    public static class IntentBuilder_ {

        private Context context_;
        private final Intent intent_;
        private Fragment fragmentSupport_;

        public IntentBuilder_(Context context) {
            context_ = context;
            intent_ = new Intent(context, NewRequestActivity_.class);
        }

        public IntentBuilder_(Fragment fragment) {
            fragmentSupport_ = fragment;
            context_ = fragment.getActivity();
            intent_ = new Intent(context_, NewRequestActivity_.class);
        }

        public Intent get() {
            return intent_;
        }

        public NewRequestActivity_.IntentBuilder_ flags(int flags) {
            intent_.setFlags(flags);
            return this;
        }

        public void start() {
            context_.startActivity(intent_);
        }

        public void startForResult(int requestCode) {
            if (fragmentSupport_!= null) {
                fragmentSupport_.startActivityForResult(intent_, requestCode);
            } else {
                if (context_ instanceof Activity) {
                    ((Activity) context_).startActivityForResult(intent_, requestCode);
                } else {
                    context_.startActivity(intent_);
                }
            }
        }

    }

}
