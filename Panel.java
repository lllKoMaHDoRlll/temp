import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;


public class Panel extends JPanel {
    JLabel header_add, header_author, header_creation_date, header_genre, header_name;
    JTextField author_input, creation_date_input, genre_input, name_input;
    JButton add_painting_button;
    ArtMuseum artMuseum;

    JLabel header_printer, header_remove, header_get;
    JTextArea printer_output;
    JTextField remove_input, get_input, get_output;
    JButton sort_by_name_button, sort_by_date_button, remove_button, get_button;


    Panel() {
        header_add = new JLabel("Add painting");
        add(header_add);

        header_author = new JLabel("Author: ");
        header_creation_date = new JLabel("Creation date: ");
        header_genre = new JLabel("Genre: ");
        header_name = new JLabel("Name: ");

        author_input = new JTextField();
        author_input.setColumns(10);
        creation_date_input = new JTextField();
        creation_date_input.setColumns(10);
        genre_input = new JTextField();
        genre_input.setColumns(10);
        name_input = new JTextField();
        name_input.setColumns(10);

        add_painting_button = new JButton("Add");
        AddingListener adding_listener = new AddingListener();
        add_painting_button.addActionListener(adding_listener);

        add(header_name);
        add(name_input);
        add(header_author);
        add(author_input);
        add(header_genre);
        add(genre_input);
        add(header_creation_date);
        add(creation_date_input);

        add(add_painting_button);

        artMuseum = new ArtMuseum();

        sort_by_name_button = new JButton("Sort by name");
        SortByNameListener sbn_listener = new SortByNameListener();
        sort_by_name_button.addActionListener(sbn_listener);

        add(sort_by_name_button);

        sort_by_date_button = new JButton("Sort by date");
        SortByDateListener sbd_listener = new SortByDateListener();
        sort_by_date_button.addActionListener(sbd_listener);

        add(sort_by_date_button);

        header_printer = new JLabel("Your List:");
        add(header_printer);
        printer_output = new JTextArea(5, 50);
        add(printer_output);

        header_remove = new JLabel("Name to remove: ");
        remove_input = new JTextField(10);
        remove_button = new JButton("Remove");
        RemoveListener removeListener = new RemoveListener();
        remove_button.addActionListener(removeListener);
        add(header_remove);
        add(remove_input);
        add(remove_button);

        header_get = new JLabel("Name to get: ");
        get_input = new JTextField(10);
        get_button = new JButton("Get");
        GetListener getListener = new GetListener();
        get_button.addActionListener(getListener);
        get_output = new JTextField(30);

        add(header_get);
        add(get_input);
        add(get_button);
        add(get_output);



    }
    void printList() {
        printer_output.setText(artMuseum.toString());
    }

    class AddingListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            String author = author_input.getText();
            author_input.setText("");
            int creation_date = Integer.parseInt(creation_date_input.getText());
            creation_date_input.setText("");
            String genre = genre_input.getText();
            genre_input.setText("");
            String name = name_input.getText();
            name_input.setText("");

            System.out.println("Author: " + author + ", Name: " + name + ", Genre: " + genre + ", Creation Date: " + creation_date);
            artMuseum.add(new Painting(author, creation_date, genre, name));

            printList();
        }
    }

    class SortByNameListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            artMuseum.sortByName();
            printList();
        }
    }

    class SortByDateListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            artMuseum.sortByDate();
            printList();
        }
    }

    class RemoveListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            artMuseum.removeByName(remove_input.getText());
            printList();
        }
    }

    class GetListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            try {
                Painting painting = artMuseum.getByName(get_input.getText());
                get_output.setText(painting.toString());
            } catch (Exception ex) {
                get_output.setText("No such painting.");
            }
            printList();
        }
    }



}

class Frame extends JFrame {
    Frame() {
        setSize(800, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Panel panel = new Panel();
        add(panel);
        setVisible(true);
    }
}
