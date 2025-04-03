

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JToolBar;
import javax.swing.WindowConstants;
import javax.swing.tree.DefaultMutableTreeNode;

import Entidades.Frase;
import Entidades.Frases;
import Entidades.traducciones;

public class FrmTraductor extends JFrame {

    private JTree arbol;
    JComboBox cbmFrases;
    JComboBox cbmIdioma;
    JTextField txtfrase;

    public FrmTraductor() {
        setSize(600, 400);
        setTitle("traductor de frases");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        JLabel lblFrase= new JLabel("Frase");
        lblFrase.setBounds(20,20,100,25);
        getContentPane().add(lblFrase);

        cbmFrases = new JComboBox();
        String[] opciones =new String[]{"Hola", "Buenos días", "Buenas Tardes", "Buenas Noches", "Cómo estas?", "Cómo te llamas?", "De dónde vienes?"};
        DefaultComboBoxModel mdlFrases= new DefaultComboBoxModel(opciones);
        cbmFrases.setModel(mdlFrases);
        cbmFrases.setBounds(120,20,200,25);
        getContentPane().add(cbmFrases);


        JLabel lblIdioma= new JLabel("Idioma");
        lblIdioma.setBounds(20,70,100,25);
        getContentPane().add(lblIdioma);

        cbmIdioma = new JComboBox();
        String[] idioma =new String[]{"Aleman", "Frances", "Ingles", "Ruso"};
        DefaultComboBoxModel mdlIdioma= new DefaultComboBoxModel(idioma);
        cbmIdioma.setModel(mdlIdioma);
        cbmIdioma.setBounds(120,70,200,25);
        getContentPane().add(cbmIdioma);


        JButton btnTraducir = new JButton("Traduccir");
        btnTraducir.setBounds(20,140,100,25);
        getContentPane().add(btnTraducir);

        txtfrase= new JTextField();
        txtfrase.setBounds(20,200,350,100);
        getContentPane().add(txtfrase);

        JToolBar tbFrase = new JToolBar();

        JButton btnReproducir = new JButton();
        btnReproducir.setIcon(new ImageIcon(getClass().getResource("/Imagen/reproducir_audio.png")));
        btnReproducir.setToolTipText("Reproducir");
        btnReproducir.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                btnReproducir();
                
                            }
                        });
                        tbFrase.add(btnReproducir);
                    }


    // private void btnReproducir() {
    //     DefaultMutableTreeNode nodoSeleccionado = (DefaultMutableTreeNode) arbol.getLastSelectedPathComponent();
    //     if (nodoSeleccionado != null) {
    //         String Audio = getAudio(nodoSeleccionado);
    //         if (!Audio.equals("")) {
    //             String rutaAudio = "src/audios/" + Audio + ".mp3"; 

    //             ReproductorAudio.reproducir(rutaAudio);
    //         }
    //     }
    // }
                
}