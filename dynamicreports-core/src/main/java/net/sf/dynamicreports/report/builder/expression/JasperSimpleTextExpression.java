package net.sf.dynamicreports.report.builder.expression;

/**
 * use for jr simple text
 *
 * @author jinlingjie
 */
public class JasperSimpleTextExpression extends JasperExpression<String> {

  /**
   * <p>Constructor for JasperExpression.</p>
   *
   * @param expression a {@link String} object.
   */
  protected JasperSimpleTextExpression(String expression) {
    super(expression, String.class);
  }
}
