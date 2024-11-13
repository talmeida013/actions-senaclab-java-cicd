package org.sen;

import java.io.IOException;

/**
 * This class demonstrates vulnerable code examples.
 */
public final class VulnerableCode {
    private VulnerableCode() {
        // Private constructor to prevent instantiation
    }

    /**
     * Main method to run the vulnerable code example.
     *
     * @param args command-line arguments
     * @throws IOException if an I/O error occurs
     */
    public static void main(final String[] args) throws IOException {
        if (args.length < 1) {
            System.out.println("Please provide a command-line argument.");
            return;
        }

        // Lack of Input Validation
        String userInput = args[0];

        // Insecure Deserialization
        try {
            // Simulate insecure deserialization (unsafe)
            byte[] serializedData = userInput.getBytes();
            Object deserializedObject = SerializationUtil
                    .deserialize(serializedData);
            System.out.println("Deserialized object: " + deserializedObject);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

/**
 * Utility class for serialization operations.
 */
final class SerializationUtil {
    private SerializationUtil() {
        // Private constructor to prevent instantiation
    }

    /**
     * Deserializes the given byte array into an object.
     *
     * @param data the byte array to deserialize
     * @return the deserialized object
     * @throws IOException if an I/O error occurs
     * @throws ClassNotFoundException if the class of the deserialized object
     *         cannot be found
     */
    public static Object deserialize(final byte[] data)
            throws IOException, ClassNotFoundException {
        java.io.ByteArrayInputStream in =
                new java.io.ByteArrayInputStream(data);
        java.io.ObjectInputStream is = new java.io.ObjectInputStream(in);
        return is.readObject();
    }
}
