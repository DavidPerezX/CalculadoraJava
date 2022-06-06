package proyectofinal;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.Set;
import javax.swing.*;

public class Interfaz extends JFrame {

    JPanel Panel, Panel1, Panel2, Panel3;
    JButton b0, b1, b2, b3, b4, b5, b6, b7, b8, b9, bsuma, bresta, bmulti, bdiv, bigual, bdec, blimpiar, bretroceder, bsigno;

    JTextField campo;
    JOptionPane Ventana1;
    private String cadenaNumeros = "";
    private boolean activado = true;
    private boolean punto = true;
    JOptionPane VentanaResultado;

    public Interfaz() {
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(450, 600);
        setTitle("Calculadora Final");
        setLocationRelativeTo(null);
        iniciarComponentes();
        b0();
        b1();
        b2();
        b3();
        b4();
        b5();
        b6();
        b7();
        b8();
        b9();
        bsuma();
        bdec();
        bsigno();
        bretroceder();
        bresta();
        bmulti();
        bdiv();
        blimpiar();
        bigual();

    }

    public void iniciarComponentes() {

        Panel = new JPanel();
        Panel1 = new JPanel();
        Panel2 = new JPanel();
        Panel3 = new JPanel();
        this.add(Panel);

        Panel.setLayout(new BorderLayout());
        Panel1.setLayout(new BoxLayout(Panel1, BoxLayout.X_AXIS));
        Panel2.setLayout(new BoxLayout(Panel2, BoxLayout.X_AXIS));
        Panel3.setLayout(new BoxLayout(Panel3, BoxLayout.X_AXIS));

        Panel.add(Panel1, BorderLayout.NORTH);
        Panel.add(Panel2, BorderLayout.CENTER);
        Panel.add(Panel3, BorderLayout.SOUTH);

        Panel.setLayout(new GridLayout(3, 1));
        Panel1.setLayout(new GridLayout(1, 3));
        Panel2.setLayout(new GridLayout(5, 3));
        Panel3.setLayout(new GridLayout(1, 1));

        campo = new JTextField("0");
        campo.addKeyListener(new KeyAdapter() {
            public void keyTyped(KeyEvent e) {
                char caracter = e.getKeyChar();

                // Verificador de teclas permitidas en el textfield
                if (!((caracter >= '0') && (caracter <= '9')
                        || (caracter == KeyEvent.VK_BACK_SPACE)
                        || (caracter == KeyEvent.VK_DELETE)
                        || (caracter == KeyEvent.VK_MINUS)
                        || (caracter == KeyEvent.VK_SLASH)
                        || (caracter == '+')
                        || (caracter == 'x')
                        || (caracter == KeyEvent.VK_PERIOD))) {
                    e.consume();  // ignorar el evento de teclado
                }
            }
        });

        campo.setFont(new Font("arial", Font.BOLD, 50));
        campo.setHorizontalAlignment(SwingConstants.CENTER);

        Panel1.add(campo);

        b1 = new JButton("1");
        b1.setFont(new Font("Berlin Sans FB Demi", Font.BOLD, 25));
        b2 = new JButton("2");
        b2.setFont(new Font("Berlin Sans FB Demi", Font.BOLD, 25));
        b3 = new JButton("3");
        b3.setFont(new Font("Berlin Sans FB Demi", Font.BOLD, 25));
        b4 = new JButton("4");
        b4.setFont(new Font("Berlin Sans FB Demi", Font.BOLD, 25));
        b5 = new JButton("5");
        b5.setFont(new Font("Berlin Sans FB Demi", Font.BOLD, 25));
        b6 = new JButton("6");
        b6.setFont(new Font("Berlin Sans FB Demi", Font.BOLD, 25));
        b7 = new JButton("7");
        b7.setFont(new Font("Berlin Sans FB Demi", Font.BOLD, 25));
        b8 = new JButton("8");
        b8.setFont(new Font("Berlin Sans FB Demi", Font.BOLD, 25));
        b9 = new JButton("9");
        b9.setFont(new Font("Berlin Sans FB Demi", Font.BOLD, 25));
        b0 = new JButton("0");
        b0.setFont(new Font("Berlin Sans FB Demi", Font.BOLD, 25));
        bdiv = new JButton("/");
        bdiv.setFont(new Font("Berlin Sans FB Demi", Font.BOLD, 25));
        bmulti = new JButton("X");
        bmulti.setFont(new Font("Berlin Sans FB Demi", Font.BOLD, 20));
        bresta = new JButton("─");
        bresta.setFont(new Font("Tahoma", Font.BOLD, 25));
        bsuma = new JButton("+");
        bsuma.setFont(new Font("Berlin Sans FB Demi", Font.BOLD, 25));
        bdec = new JButton(".");
        bdec.setFont(new Font("Berlin Sans FB Demi", Font.BOLD, 25));
        blimpiar = new JButton("C");
        blimpiar.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 20));
        bsigno = new JButton("+/-");
        bsigno.setFont(new Font("Berlin Sans FB Demi", Font.BOLD, 25));
        bretroceder = new JButton("<");
        bretroceder.setFont(new Font("Berlin Sans FB Demi", Font.BOLD, 25));
        bigual = new JButton("=");
        bigual.setFont(new Font("Berlin Sans FB Demi", Font.BOLD, 45));

        Panel2.add(b7);
        Panel2.add(b8);
        Panel2.add(b9);
        Panel2.add(bmulti);

        Panel2.add(b4);
        Panel2.add(b5);
        Panel2.add(b6);
        Panel2.add(bresta);

        Panel2.add(b1);
        Panel2.add(b2);
        Panel2.add(b3);
        Panel2.add(bsuma);

        Panel2.add(bdec);
        Panel2.add(b0);
        Panel2.add(bsigno);
        Panel2.add(bdiv);

        Panel2.add(blimpiar);
        Panel2.add(bretroceder);
        Panel3.add(bigual);
    }

    private void b0() {
        ActionListener oyente = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                if (cadenaNumeros != "") {
                    if (campo.getText() == "0") {
                        cadenaNumeros = "0";
                    } else {
                        cadenaNumeros += "0";
                    }
                    campo.setText(cadenaNumeros);
                    activado = true;
                }
            }
        };
        b0.addActionListener(oyente);
    }

    private void b1() {
        ActionListener oyente = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                if (campo.getText() == "0") {
                    cadenaNumeros = "1";
                } else {
                    cadenaNumeros += "1";
                }

                campo.setText(cadenaNumeros);
                activado = true;
            }
        };
        b1.addActionListener(oyente);
    }

    private void b2() {
        ActionListener oyente = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                if (campo.getText() == "0") {
                    cadenaNumeros = "2";
                } else {
                    cadenaNumeros += "2";
                }
                campo.setText(cadenaNumeros);
                activado = true;
            }
        };
        b2.addActionListener(oyente);
    }

    private void b3() {
        ActionListener oyente = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                if (campo.getText() == "0") {
                    cadenaNumeros = "3";
                } else {
                    cadenaNumeros += "3";
                }
                campo.setText(cadenaNumeros);
                activado = true;
            }
        };
        b3.addActionListener(oyente);
    }

    private void b4() {
        ActionListener oyente = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                if (campo.getText() == "0") {
                    cadenaNumeros = "4";
                } else {
                    cadenaNumeros += "4";
                }
                campo.setText(cadenaNumeros);
                activado = true;
            }
        };
        b4.addActionListener(oyente);
    }

    private void b5() {
        ActionListener oyente = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                if (campo.getText() == "0") {
                    cadenaNumeros = "5";
                } else {
                    cadenaNumeros += "5";
                }
                campo.setText(cadenaNumeros);
                activado = true;
            }
        };
        b5.addActionListener(oyente);
    }

    private void b6() {
        ActionListener oyente = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                if (campo.getText() == "0") {
                    cadenaNumeros = "6";
                } else {
                    cadenaNumeros += "6";
                }
                campo.setText(cadenaNumeros);
                activado = true;
            }
        };
        b6.addActionListener(oyente);
    }

    private void b7() {
        ActionListener oyente = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                if (campo.getText() == "0") {
                    cadenaNumeros = "7";
                } else {
                    cadenaNumeros += "7";
                }
                campo.setText(cadenaNumeros);
                activado = true;
            }
        };
        b7.addActionListener(oyente);
    }

    private void b8() {
        ActionListener oyente = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                if (campo.getText() == "0") {
                    cadenaNumeros = "8";
                } else {
                    cadenaNumeros += "8";
                }
                campo.setText(cadenaNumeros);
                activado = true;
            }
        };
        b8.addActionListener(oyente);
    }

    private void b9() {
        ActionListener oyente = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                if (campo.getText() == "0") {
                    cadenaNumeros = "9";
                } else {
                    cadenaNumeros += "9";
                }
                campo.setText(cadenaNumeros);
                activado = true;
            }
        };
        b9.addActionListener(oyente);
    }

    private void bsuma() {
        ActionListener oyente = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                if (activado == true) {
                    cadenaNumeros += "+";
                    campo.setText(cadenaNumeros);
                    activado = false;
                    punto = true;
                }

            }
        };
        bsuma.addActionListener(oyente);
    }

    private void bdec() {
        ActionListener oyente = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                if (punto == true) {

                    if (cadenaNumeros == "") {
                        cadenaNumeros = "0.";
                    } else {
                        cadenaNumeros += ".";

                    }
                    campo.setText(cadenaNumeros);
                    punto = false;
                }
            }
        };
        bdec.addActionListener(oyente);
    }

    private void bsigno() {
        ActionListener oyente = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                if (cadenaNumeros.charAt(0) != '-') {
                    cadenaNumeros = "-" + cadenaNumeros;
                } else {
                    cadenaNumeros = cadenaNumeros.substring(1, cadenaNumeros.length());
                }
                campo.setText(cadenaNumeros);
            }
        };
        bsigno.addActionListener(oyente);
    }

    private void bretroceder() {
        ActionListener oyente = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                int tamaño = cadenaNumeros.length();
                if (tamaño > 0) {
                    if (tamaño == 1) {
                        cadenaNumeros = "0";
                    } else {
                        cadenaNumeros = cadenaNumeros.substring(0, cadenaNumeros.length() - 1);
                    }
                    campo.setText(cadenaNumeros);
                }
            }
        };
        bretroceder.addActionListener(oyente);
    }

    private void bresta() {
        ActionListener oyente = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                if (activado == true) {
                    cadenaNumeros += "-";
                    campo.setText(cadenaNumeros);
                    activado = false;
                    punto = true;
                }
            }
        };
        bresta.addActionListener(oyente);
    }

    private void bmulti() {
        ActionListener oyente = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                if (activado == true) {
                    cadenaNumeros += "x";
                    campo.setText(cadenaNumeros);
                    activado = false;
                    punto = true;
                }
            }
        };
        bmulti.addActionListener(oyente);
    }

    private void bdiv() {
        ActionListener oyente = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                if (activado == true) {
                    cadenaNumeros += "/";
                    campo.setText(cadenaNumeros);
                    activado = false;
                    punto = true;
                }
            }
        };
        bdiv.addActionListener(oyente);
    }

    private void blimpiar() {
        ActionListener oyente = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                campo.setText("0");
                cadenaNumeros = "";
                activado = true;
                punto = true;

            }
        };
        blimpiar.addActionListener(oyente);
    }

    private void bigual() {
        operaciones ecuacion = new operaciones();
        ActionListener oyente = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                if (campo.getText() == "") {
                    JOptionPane.showMessageDialog(Panel, "El resultado es: 0");
                } else {
                    cadenaNumeros = campo.getText();
                    JOptionPane.showMessageDialog(Panel, "El resultado es: " + (ecuacion.formula(cadenaNumeros)), "Resultado", 1);

                }
            }
        };
        bigual.addActionListener(oyente);
    }
}
