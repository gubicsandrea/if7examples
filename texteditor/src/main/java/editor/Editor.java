package editor;

public class Editor {
    private String text = "";

    public Editor(String text) {
        if (text == null) {
            throw new IllegalArgumentException("text cannot be null");
        }
        this.text = text;
    }

    public Editor() {
    }

    public String getText() {
        return text;
    }

    public String select(int from, int to) {
        if (from > text.length() || to > text.length() || from < 0 || to < 0) {
            throw new IllegalArgumentException("Invalid index!");
        }
        if (to > from) {
            return text.substring(from, to);
        }
        return text.substring(to, from);
    }

    public int find(String part) {
        if (part == null) {
            throw new IllegalArgumentException("Part can not be null!");
        }
        if (part.equals("")) {
            return -1;
        }
        return text.indexOf(part);
    }

    public CursorInterface getCursor() {
        Cursor cursor = new Cursor(0);
        return cursor;
    }

    public enum Mode {
        INSERT, REPLACE;
    }

    private class Cursor implements CursorInterface {

        private int position;

        public Cursor(int position) {
            this.position = position;
        }

        @Override
        public void add(String text, Mode mode) {
            if (text == null || mode == null) {
                throw new IllegalArgumentException("Parameter(s) cannot be null");
            }
            StringBuilder sb = new StringBuilder();
            sb.append(Editor.this.text.substring(0, position));
            sb.append(text);
            if (mode == Mode.INSERT) {
                sb.append(Editor.this.text.substring(position));
            } else {

                sb.append(Editor.this.text.substring(position).length() <= text.length()
                        ? ""
                        : Editor.this.text.substring(position + text.length()));
            }
            Editor.this.text = sb.toString();
            position += text.length();
        }
    }


}
