/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package package_dwarf;

import java.awt.event.ActionListener;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import javax.swing.JSpinner;
import javax.swing.SpinnerNumberModel;

/**
 *
 * @author Eduardo
 */
public class FerramentaJFrame extends javax.swing.JFrame {

    private DefaultListModel<Ferramenta> listaModel;
    public FerramentaJFrame() {
        listaModel = new DefaultListModel<Ferramenta>();
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        insereListajButton1 = new javax.swing.JButton();
        limpaListajButton3 = new javax.swing.JButton();
        carregaBancojButton4 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        listaExamesjList1 = new javax.swing.JList<package_dwarf.Ferramenta>();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("DWARF");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setSize(new java.awt.Dimension(716, 468));
        getContentPane().setLayout(null);

        jLabel1.setForeground(new java.awt.Color(255, 255, 0));
        jLabel1.setText("Selecione a ferramenta:");
        jLabel1.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        getContentPane().add(jLabel1);
        jLabel1.setBounds(25, 43, 161, 16);

        insereListajButton1.setText("Adquirir ferramenta!");
        getContentPane().add(insereListajButton1);
        insereListajButton1.setBounds(25, 140, 170, 32);

        limpaListajButton3.setText("Limpa Lista");
        getContentPane().add(limpaListajButton3);
        limpaListajButton3.setBounds(25, 178, 170, 32);

        carregaBancojButton4.setText("Visualizar lista");
        getContentPane().add(carregaBancojButton4);
        carregaBancojButton4.setBounds(25, 216, 170, 32);

        listaExamesjList1.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        listaExamesjList1.setModel(listaModel);
        jScrollPane1.setViewportView(listaExamesjList1);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(230, 30, 410, 355);

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });
        getContentPane().add(jComboBox1);
        jComboBox1.setBounds(25, 65, 178, 26);

        jLabel2.setText("Módulo Dwarf 1.0.0");
        jLabel2.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        getContentPane().add(jLabel2);
        jLabel2.setBounds(0, 430, 108, 16);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/package_dwarf/bg2.gif"))); // NOI18N
        getContentPane().add(jLabel3);
        jLabel3.setBounds(0, 0, 670, 430);

        setBounds(0, 0, 687, 487);
    }// </editor-fold>//GEN-END:initComponents

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox1ActionPerformed

    public Ferramenta obterFerramenta(){
            String nomeFerramenta = null;
            int quantidade = 0;
            int dano = 0;
            int peso = 0;
            
        String ferramenta;
        ferramenta = (String) jComboBox1.getSelectedItem();
        Integer value = 1;
        Integer min = 1;
        Integer max = 10;
        Integer step = 1;
        SpinnerNumberModel sModel = new SpinnerNumberModel(value, min, max, step);
        JSpinner spinner = new JSpinner(sModel);
        int option = JOptionPane.showOptionDialog(null, spinner, "Selecione a quantidade.\n(máximo de 10 itens)", JOptionPane.OK_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null, null, null);
        int qtd = (int) spinner.getValue();

        switch(ferramenta){
            case "Corda Magica":
                nomeFerramenta = ferramenta;
                quantidade = qtd;
                dano = 10;
                peso = 1;
            break;
            
            case "Martelo Flamejante":
                nomeFerramenta = ferramenta;
                quantidade = qtd;
                dano = 35;
                peso = 15;
            break;
            
            case "Berrante Temeriano":
                nomeFerramenta = ferramenta;
                quantidade = qtd;
                dano = 15;
                peso = 10;
            break;
            
            case "Laço Divino":
                nomeFerramenta = ferramenta;
                quantidade = qtd;
                dano = 5;
                peso = 1;
            break;
            
            default:
                System.out.println("Ocorreu alguma coisa de errado...");
        }
        
       Ferramenta ex = new Ferramenta(nomeFerramenta, quantidade, dano,  peso);
       return ex;
    }   
    public void insereLista(Ferramenta ex){
        listaModel.addElement(ex);        
    }
    public void limparLista(){
        listaModel.clear();
    }
    public void addInserirListaListener(ActionListener al){
        insereListajButton1.addActionListener(al);
    }
  
    public void addLimpaListaListener(ActionListener al){
        limpaListajButton3.addActionListener(al);
    }
    public void addCarregaListaListener(ActionListener al){
        carregaBancojButton4.addActionListener(al);
    }
    public void addItemComboBox(){
        jComboBox1.addItem("Corda Magica");
        jComboBox1.addItem("Martelo Flamejante");
        jComboBox1.addItem("Berrante Temeriano");
        jComboBox1.addItem("Laço Divino");
        jComboBox1.setSelectedItem(null);
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton carregaBancojButton4;
    private javax.swing.JButton insereListajButton1;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton limpaListajButton3;
    private javax.swing.JList<package_dwarf.Ferramenta> listaExamesjList1;
    // End of variables declaration//GEN-END:variables

}
