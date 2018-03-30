
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.FlowLayout;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class PanelDemo extends JFrame implements ActionListener
{
    public static final int WIDTH = 300;
    public static final int HEIGHT = 200;

    private JPanel redPanel;
    private JPanel whitePanel;
    private JPanel bluePanel;
    private JPanel pinkPanel;
    private JPanel greenPanel;
    private JPanel yellowPanel;
    

    public static void main(String[] args)
    {
        PanelDemo gui = new PanelDemo( );
        gui.setVisible(true);
    }

    public PanelDemo( )
    {
        super("Panel Demonstration");
        setSize(WIDTH, HEIGHT);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout( ));

        JPanel biggerPanel = new JPanel( );
        biggerPanel.setLayout(new GridLayout(2, 3));

        redPanel = new JPanel( );
        redPanel.setBackground(Color.LIGHT_GRAY);
        biggerPanel.add(redPanel);

        whitePanel = new JPanel( );
        whitePanel.setBackground(Color.LIGHT_GRAY);
        biggerPanel.add(whitePanel);

        bluePanel = new JPanel( );
        bluePanel.setBackground(Color.LIGHT_GRAY);
        biggerPanel.add(bluePanel);
        
        pinkPanel = new JPanel( );
        pinkPanel.setBackground(Color.LIGHT_GRAY);
        biggerPanel.add(pinkPanel);

        greenPanel = new JPanel( );
        greenPanel.setBackground(Color.LIGHT_GRAY);
        biggerPanel.add(greenPanel);

        yellowPanel = new JPanel( );
        yellowPanel.setBackground(Color.LIGHT_GRAY);
        biggerPanel.add(yellowPanel);

        add(biggerPanel, BorderLayout.CENTER);

        JPanel buttonPanel = new JPanel( );
        buttonPanel.setBackground(Color.LIGHT_GRAY);
        buttonPanel.setLayout(new FlowLayout( ));
        
        JPanel buttonPanel2 = new JPanel();
        buttonPanel2.setBackground(Color.LIGHT_GRAY);
        buttonPanel2.setLayout(new FlowLayout( ));

        JButton redButton = new JButton("Red");
        redButton.setBackground(Color.RED);
        redButton.addActionListener(this);
        buttonPanel.add(redButton);

        JButton whiteButton = new JButton("White");
        whiteButton.setBackground(Color.WHITE);
        whiteButton.addActionListener(this);
        buttonPanel.add(whiteButton);

        JButton blueButton = new JButton("Blue");
        blueButton.setBackground(Color.BLUE);
        blueButton.addActionListener(this);
        buttonPanel.add(blueButton);
   
        JButton pinkButton = new JButton("Pink");
        pinkButton.setBackground(Color.PINK);
        pinkButton.addActionListener(this);
        buttonPanel2.add(pinkButton);

        JButton greenButton = new JButton("Green");
        greenButton.setBackground(Color.GREEN);
        greenButton.addActionListener(this);
        buttonPanel2.add(greenButton);

        JButton yellowButton = new JButton("Yellow");
        yellowButton.setBackground(Color.YELLOW);
        yellowButton.addActionListener(this);
        buttonPanel2.add(yellowButton);

        add(buttonPanel, BorderLayout.SOUTH);
        add(buttonPanel2, BorderLayout.NORTH);
    }

    public void actionPerformed(ActionEvent e)
    {
        String buttonString = e.getActionCommand( );

        if (buttonString.equals("Red"))
             redPanel.setBackground(Color.RED);
        else if (buttonString.equals("White"))
            whitePanel.setBackground(Color.WHITE);
        else if (buttonString.equals("Blue"))
            bluePanel.setBackground(Color.BLUE);
        else if (buttonString.equals("Pink"))
            pinkPanel.setBackground(Color.PINK);
       else if (buttonString.equals("Green"))
           greenPanel.setBackground(Color.GREEN);
       else if (buttonString.equals("Yellow"))
           yellowPanel.setBackground(Color.YELLOW);
        else
            System.out.println("Unexpected error.");
    }
}
