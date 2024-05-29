package net.sf.dynamicreports.report.builder.expression;

import java.awt.Image;

/**
 * 用于图片表达式，避免使用动态编译
 *
 * @author jinlingjie
 */
public class ImageValueExpression extends ValueExpression<Image> {

  public ImageValueExpression(Image image) {
    super(image);
  }
}
