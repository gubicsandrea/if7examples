package editor;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.assertThat;

public class EditorTest {

    @Rule
    public ExpectedException expectedException = ExpectedException.none();

    @Test
    public void createEditor() {
        Editor editor = new Editor("Alma körte szilva");

        assertThat(editor.getText(), equalTo("Alma körte szilva"));
    }

    @Test
    public void createEditor2() {
        Editor editor = new Editor();

        assertThat(editor.getText(), equalTo(""));
    }

    @Test
    public void createEditorWithNull() {
        expectedException.expect(IllegalArgumentException.class);

        new Editor(null);
    }

    @Test
    public void testFindContains() {
        Editor editor = new Editor("alma körte barack");
        int i = editor.find("kör");
        assertThat(i, equalTo(5));
    }

    @Test
    public void testFindDoesNotContain() {
        Editor editor = new Editor("alma körte barack");
        int i = editor.find("szilva");
        assertThat(i, equalTo(-1));
    }

    @Test
    public void testFindNull() {
        Editor editor = new Editor("alma körte barack");
        expectedException.expect(IllegalArgumentException.class);
        editor.find(null);
    }

    @Test
    public void testSelect() {
        Editor editor = new Editor("alma körte barack");
        String st = editor.select(0, 4);
        assertThat(st, equalTo("alma"));
    }

    @Test
    public void testSelect2() {
        Editor editor = new Editor("alma körte barack");
        String st = editor.select(4, 0);
        assertThat(st, equalTo("alma"));
    }

    @Test
    public void testSelect3() {
        Editor editor = new Editor("alma körte barack");
        expectedException.expect(IllegalArgumentException.class);
        editor.select(-1, 2);
    }

    @Test
    public void testSelect4() {
        Editor editor = new Editor("alma körte barack");
        expectedException.expect(IllegalArgumentException.class);
        editor.select(1, -2);
    }

    @Test
    public void testSelect5() {
        Editor editor = new Editor("alma körte barack");
        expectedException.expect(IllegalArgumentException.class);
        editor.select(1, editor.getText().length() + 1);
    }

    @Test
    public void testSelect6() {
        Editor editor = new Editor("alma körte barack");
        expectedException.expect(IllegalArgumentException.class);
        editor.select(editor.getText().length() + 1, 1);
    }

    @Test
    public void testCursorCreateAdd() {
        Editor editor = new Editor("alma körte barack");
        CursorInterface cursor = editor.getCursor();
        cursor.add("valami", Editor.Mode.INSERT);
        assertThat(editor.getText(), equalTo("valamialma körte barack"));
    }

    @Test
    public void testCursorCreateReplace() {
        Editor editor = new Editor("alma körte barack");
        CursorInterface cursor = editor.getCursor();
        cursor.add("valami", Editor.Mode.REPLACE);
        assertThat(editor.getText(), equalTo("valamiörte barack"));
    }

    @Test
    public void testCursorAddNull() {
        expectedException.expect(IllegalArgumentException.class);
        Editor editor = new Editor("alma körte barack");
        CursorInterface cursor = editor.getCursor();
        cursor.add(null, Editor.Mode.REPLACE);
    }

    @Test
    public void testCursorNullMode() {
        expectedException.expect(IllegalArgumentException.class);
        Editor editor = new Editor("alma körte barack");
        CursorInterface cursor = editor.getCursor();
        cursor.add("valami", null);
    }
}
