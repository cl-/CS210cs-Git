import org.eclipse.swt.events.DisposeEvent;
import org.eclipse.swt.events.DisposeListener;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
import org.eclipse.ui.forms.widgets.FormToolkit;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.TabFolder;
import org.eclipse.swt.widgets.TabItem;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.ExpandBar;
import org.eclipse.swt.custom.ScrolledComposite;
import org.eclipse.swt.widgets.Text;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.List;
import org.eclipse.swt.widgets.Canvas;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;


public class background extends Composite {

	private final FormToolkit toolkit = new FormToolkit(Display.getCurrent());
	private Text inAmount;
	private Text inSponsor;
	private Text inTimeStart;
	private Text inTimeEnd;
	private Text inActivity;
	private Text inItem;
	private Label outExpenditure;

	/**
	 * Create the composite.
	 * @param parent
	 * @param style
	 */
	public background(Composite parent, int style) {
		super(parent, style);
		addDisposeListener(new DisposeListener() {
			public void widgetDisposed(DisposeEvent e) {
				toolkit.dispose();
			}
		});
		toolkit.adapt(this);
		toolkit.paintBordersFor(this);
		
		Composite composite = new Composite(this, SWT.NONE);
		composite.setBounds(10, 10, 155, 500);
		toolkit.adapt(composite);
		toolkit.paintBordersFor(composite);
		
		TabFolder tabFolder = new TabFolder(this, SWT.NONE);
		tabFolder.setBounds(171, 0, 619, 510);
		toolkit.adapt(tabFolder);
		toolkit.paintBordersFor(tabFolder);
		
		//START OF BUDGET TAB ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
		
		TabItem tbtmBudget = new TabItem(tabFolder, SWT.NONE);
		tbtmBudget.setText("Budget");
		
		Composite composite_1 = new Composite(tabFolder, SWT.NONE);
		tbtmBudget.setControl(composite_1);
		toolkit.paintBordersFor(composite_1);
		
		Label lblBudget = new Label(composite_1, SWT.NONE);
		lblBudget.setBounds(10, 10, 55, 15);
		toolkit.adapt(lblBudget, true, true);
		lblBudget.setText("Budget");
		
		Label lblExpenditure = new Label(composite_1, SWT.NONE);
		lblExpenditure.setBounds(10, 175, 62, 15);
		toolkit.adapt(lblExpenditure, true, true);
		lblExpenditure.setText("Expenditure");
		
		ScrolledComposite scrolledComposite = new ScrolledComposite(composite_1, SWT.BORDER | SWT.H_SCROLL | SWT.V_SCROLL);
		scrolledComposite.setBounds(10, 31, 591, 85);
		toolkit.adapt(scrolledComposite);
		toolkit.paintBordersFor(scrolledComposite);
		scrolledComposite.setExpandHorizontal(true);
		scrolledComposite.setExpandVertical(true);
		
		Label outBudget = new Label(scrolledComposite, SWT.NONE);
		toolkit.adapt(outBudget, true, true);
		scrolledComposite.setContent(outBudget);
		scrolledComposite.setMinSize(outBudget.computeSize(SWT.DEFAULT, SWT.DEFAULT));
		
		inAmount = new Text(composite_1, SWT.BORDER);
		inAmount.setText("amount in $");
		inAmount.setBounds(10, 129, 76, 21);
		toolkit.adapt(inAmount, true, true);
		
		Label lblFrom = new Label(composite_1, SWT.NONE);
		lblFrom.setBounds(92, 132, 26, 15);
		toolkit.adapt(lblFrom, true, true);
		lblFrom.setText("from");
		
		inSponsor = new Text(composite_1, SWT.BORDER);
		inSponsor.setText("sponsor");
		inSponsor.setBounds(124, 129, 260, 21);
		toolkit.adapt(inSponsor, true, true);
		
		Button btnAddBudget = new Button(composite_1, SWT.NONE);
		btnAddBudget.setBounds(410, 129, 89, 25);
		toolkit.adapt(btnAddBudget, true, true);
		btnAddBudget.setText("Add to Budget");
		
		outExpenditure = new Label(composite_1, SWT.NONE);
		outExpenditure.setBounds(10, 196, 55, 15);
		toolkit.adapt(outExpenditure, true, true);
		
		inItem = new Text(composite_1, SWT.BORDER);
		inItem.setText("item");
		inItem.setBounds(10, 395, 374, 21);
		toolkit.adapt(inItem, true, true);
		
		Button btnAddMiscItem = new Button(composite_1, SWT.NONE);
		btnAddMiscItem.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				if(!inItem.getText().equals(""))
					outExpenditure.setText(inItem.getText());
			}
		});
		btnAddMiscItem.setBounds(410, 393, 75, 25);
		toolkit.adapt(btnAddMiscItem, true, true);
		btnAddMiscItem.setText("Add Item");
		
		//START OF VENUE TAB~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
		
		TabItem tbtmNewItem = new TabItem(tabFolder, SWT.NONE);
		tbtmNewItem.setText("Venue");
		
		Composite composite_2 = new Composite(tabFolder, SWT.NONE);
		tbtmNewItem.setControl(composite_2);
		toolkit.paintBordersFor(composite_2);
		
		//START OF PROGRAM TAB~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
		
		TabItem tbtmProgram = new TabItem(tabFolder, SWT.NONE);
		tbtmProgram.setText("Program");
		
		Composite composite_3 = new Composite(tabFolder, SWT.NONE);
		tbtmProgram.setControl(composite_3);
		toolkit.paintBordersFor(composite_3);
		
		Label lblTime = new Label(composite_3, SWT.NONE);
		lblTime.setBounds(10, 10, 27, 15);
		toolkit.adapt(lblTime, true, true);
		lblTime.setText("Time");
		
		Label lblActivity = new Label(composite_3, SWT.NONE);
		lblActivity.setBounds(105, 10, 55, 15);
		toolkit.adapt(lblActivity, true, true);
		lblActivity.setText("Activity");
		
		ScrolledComposite scrolledComposite_1 = new ScrolledComposite(composite_3, SWT.BORDER | SWT.H_SCROLL | SWT.V_SCROLL);
		scrolledComposite_1.setBounds(10, 31, 85, 270);
		toolkit.adapt(scrolledComposite_1);
		toolkit.paintBordersFor(scrolledComposite_1);
		scrolledComposite_1.setExpandHorizontal(true);
		scrolledComposite_1.setExpandVertical(true);
		
		Label outTime = new Label(scrolledComposite_1, SWT.NONE);
		toolkit.adapt(outTime, true, true);
		scrolledComposite_1.setContent(outTime);
		scrolledComposite_1.setMinSize(outTime.computeSize(SWT.DEFAULT, SWT.DEFAULT));
		
		ScrolledComposite scrolledComposite_2 = new ScrolledComposite(composite_3, SWT.BORDER | SWT.H_SCROLL | SWT.V_SCROLL);
		scrolledComposite_2.setBounds(105, 31, 496, 270);
		toolkit.adapt(scrolledComposite_2);
		toolkit.paintBordersFor(scrolledComposite_2);
		scrolledComposite_2.setExpandHorizontal(true);
		scrolledComposite_2.setExpandVertical(true);
		
		Label outActivity = new Label(scrolledComposite_2, SWT.NONE);
		toolkit.adapt(outActivity, true, true);
		scrolledComposite_2.setContent(outActivity);
		scrolledComposite_2.setMinSize(outActivity.computeSize(SWT.DEFAULT, SWT.DEFAULT));
		
		inTimeStart = new Text(composite_3, SWT.BORDER);
		inTimeStart.setText("start");
		inTimeStart.setBounds(10, 380, 76, 21);
		toolkit.adapt(inTimeStart, true, true);
		
		Label lblTo = new Label(composite_3, SWT.NONE);
		lblTo.setBounds(92, 380, 11, 15);
		toolkit.adapt(lblTo, true, true);
		lblTo.setText("to");
		
		inTimeEnd = new Text(composite_3, SWT.BORDER);
		inTimeEnd.setText("end");
		inTimeEnd.setBounds(110, 380, 76, 21);
		toolkit.adapt(inTimeEnd, true, true);
		
		inActivity = new Text(composite_3, SWT.BORDER);
		inActivity.setText("activity");
		inActivity.setBounds(210, 380, 210, 21);
		toolkit.adapt(inActivity, true, true);
		
		Button btnAddActivity = new Button(composite_3, SWT.NONE);
		btnAddActivity.setBounds(460, 380, 75, 25);
		toolkit.adapt(btnAddActivity, true, true);
		btnAddActivity.setText("Add Activity");

	}
	
	public static void main(String[]args){
		Display display = new Display();
		Shell shell = new Shell(display);
		background bgd = new background(shell, SWT.NONE);
		bgd.pack();
		shell.pack();
		shell.open();
		while(!shell.isDisposed()){
			if(!display.readAndDispatch()) display.sleep();
		}
	}
}
