package objects;

import java.util.ArrayList;

public class BlogProject {

    public ArrayList<Usuario> getUsuarios() {
        ArrayList<Usuario> usuarios = new ArrayList<Usuario>();
        usuarios.add(new Usuario(1, "Carlos Gonzalez", "Dark_Side", "5854-7854"));
        usuarios.add(new Usuario(2, "Blanca Peña", "blueeyes", "9654-8534"));
        usuarios.add(new Usuario(3, "Silvia Orozco", "pignic", "8765-3214"));
        usuarios.add(new Usuario(4, "Estuardo Espinoza", "lover21", "8745-9632"));
        usuarios.add(new Usuario(5, "Luis Angel Yol", "kaibilTecun11", "7694-2846"));
        return usuarios;
    }

    public ArrayList<Entrada> getEntradas() {
        ArrayList<Entrada> entradas = new ArrayList<Entrada>();
        ArrayList<Usuario> usuarios;
        usuarios = this.getUsuarios();

        Entrada entrada = new Entrada();
        entrada.createEntrada("Android 7", "Donec tincidunt diam et diam luctus eleifend. Morbi eget nibh libero. Phasellus semper erat vel sem tincidunt, non aliquet velit tempus. Integer nec nisi eu urna cursus iaculis. Vestibulum a ante vitae magna viverra malesuada vitae in justo. Nunc viverra mauris id enim laoreet, commodo ultrices mauris tincidunt. In finibus ornare lacus.",
                "24/04/2017", usuarios.get(0));
        entradas.add(entrada);

        entrada = new Entrada();
        entrada.createEntrada("Angular 2", "Sed in sem in neque scelerisque aliquam in in felis. Cras lobortis urna vitae dapibus dictum. Maecenas fermentum vulputate suscipit. Vivamus a elit at arcu consectetur faucibus sit amet quis ipsum. Sed erat risus, molestie nec erat nec, aliquet semper dui. Nulla lobortis iaculis neque eu viverra. Suspendisse interdum arcu quis interdum mattis. In ornare lacinia massa, malesuada consequat velit volutpat non. Pellentesque mattis sed enim sit amet vulputate. Nulla vel iaculis nibh. Aliquam sodales euismod mollis. Cras tincidunt ipsum sed nisi posuere, sit amet semper dolor blandit. Integer fringilla porta elit vitae ultricies. Nunc eu porttitor sapien. Nulla justo turpis, pretium eu consectetur ut, viverra sit amet nibh. Praesent porta nisi at elit consectetur fermentum.",
                "20/04/2017", usuarios.get(1));
        entradas.add(entrada);

        entrada = new Entrada();
        entrada.createEntrada("Samsung Gear Fit 2", "In euismod orci in ipsum commodo consectetur. Nulla facilisi. Lorem ipsum dolor sit amet, consectetur adipiscing elit. Aliquam dictum hendrerit massa, ut lobortis nisi venenatis commodo. Sed tempus blandit luctus. Quisque scelerisque turpis sit amet tortor scelerisque condimentum. Curabitur sed urna lorem. Mauris tempus mauris rutrum velit ornare ullamcorper. Vestibulum non nibh euismod, elementum ligula a, faucibus lorem. Class aptent taciti sociosqu ad litora torquent per conubia nostra, per inceptos himenaeos. Mauris sodales pellentesque ipsum quis maximus. Interdum et malesuada fames ac ante ipsum primis in faucibus. Integer rutrum orci eget accumsan laoreet. Praesent pretium ut neque quis pharetra.",
                "14/04/2017", usuarios.get(2));
        entradas.add(entrada);

        entrada = new Entrada();
        entrada.createEntrada("World War 3", "Mauris molestie velit justo, nec mollis nunc ultrices nec. Sed ex diam, porttitor vitae nulla pulvinar, pharetra interdum ligula. Sed pretium molestie ex vel aliquam. Nam aliquet est ac quam pretium rhoncus. Donec eu placerat sapien. Morbi enim purus, pharetra ac pulvinar sit amet, suscipit semper sem. Sed ut ante tortor. Phasellus aliquam ut velit id consectetur. Aenean dapibus justo cursus eros tristique rhoncus. Sed ullamcorper, purus mollis malesuada tempus, tortor enim rhoncus elit, non consequat quam purus laoreet neque. Duis vestibulum malesuada nibh, quis tincidunt augue lobortis id. Phasellus vel aliquet urna, eget varius nulla. Vestibulum sapien nisl, laoreet et convallis vulputate, laoreet sit amet eros. Suspendisse cursus erat odio, id tincidunt augue sollicitudin ac. Duis hendrerit eros vitae vestibulum suscipit.",
                "24/03/2017", usuarios.get(3));
        entradas.add(entrada);

        return entradas;
    }

}
