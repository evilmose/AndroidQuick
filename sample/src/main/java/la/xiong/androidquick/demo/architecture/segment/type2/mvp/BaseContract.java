package la.xiong.androidquick.demo.architecture.segment.type2.mvp;

/**
 * @author ddnosh
 * @website http://blog.csdn.net/ddnosh
 */
public interface BaseContract {

    interface BasePresenter<T extends BaseContract.BaseView> {

    }

    interface BaseView {

    }
}
