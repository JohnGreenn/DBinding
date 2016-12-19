package kale.viewmodel;

import android.graphics.Bitmap;

import vm.CommonViewModel;

/**
 * @author Kale
 * @date 2016/12/18
 */

public class HeaderLayoutVm extends ViewModelWrapper {

    public HeaderLayoutVm(CommonViewModel viewModel) {
        super(viewModel);
    }

    public void setPic(Bitmap pic) {
        viewModel.setPic(pic);
    }

    public void setName(CharSequence name) {
        viewModel.setName(name);
    }

}