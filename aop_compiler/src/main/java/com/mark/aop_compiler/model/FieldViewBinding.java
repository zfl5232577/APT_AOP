package com.mark.aop_compiler.model;



import com.mark.aop_annotation.InjectView;

import javax.lang.model.element.Element;
import javax.lang.model.element.VariableElement;
import javax.lang.model.type.TypeMirror;


/**
 * Created by cry on 2016/9/21.
 */

public class FieldViewBinding {

    /**
     * 注解元素
     */
    private VariableElement mElement;

    /**
     * 资源id
     */
    private int mResId;

    /**
     * 变量名
     */
    private String mVariableName;

    /**
     * 变量类型
     */
    private TypeMirror mTypeMirror;

    public FieldViewBinding(Element element) {

        mElement = (VariableElement) element;

        InjectView viewById = element.getAnnotation(InjectView.class);
        mResId = viewById.value();

        //变量名
        mVariableName = element.getSimpleName().toString();

        //变量类型
        mTypeMirror = element.asType();
    }

    public VariableElement getElement() {
        return mElement;
    }

    public int getResId() {
        return mResId;
    }

    public String getVariableName() {
        return mVariableName;
    }

    public TypeMirror getTypeMirror() {
        return mTypeMirror;
    }
}
